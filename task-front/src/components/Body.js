import React, { Component } from 'react';
//import sendHttpRequest from '../Utils/AxiosUtils'
import axios from 'axios';
class Body extends Component {
    constructor(props) {
        super(props);
        this.state = {
            taskGroup: {
                Body: {
                    hrs_jornada: 0,
                    dias_termino: 0,
                    jornadas: [
                                {
                                    id: 0,
                                    timeToDone: 0,
                                    taskList: [""]
                                }
                            ]
                }
            }
        }
        //this.getData = this.getData.bind(this);
    }

    componentDidMount() {
        this.getData();
    }

    getData(){
        axios({
            method:'GET',
            url:'http://localhost:8001/task/tasksPerWorkingDay',
            headers: {
                'Content-type': 'application/json; charset=utf-8',
                'Accept': 'application/json; charset=utf-8'
            },
            responseType:'json'
        }).then(res => {
            this.setState({ taskGroup: res.data });
        })
    }
    render() {
        return (
            <div>
                
                <blockquote align="left" className="blockquote">
                    <span>Horas de una jornada laboral: {this.state.taskGroup.Body.hrs_jornada}<br />
                    Días para terminar todas las tareas: {this.state.taskGroup.Body.dias_termino}
                    </span>
                </blockquote>
                 
                <br />
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col"># Jornada</th>
                            <th scope="col">Cumplimiento (Horas)</th>
                            <th scope="col">Tareas</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.taskGroup.Body.jornadas.map(jornada => 
                            <tr>
                                <th scope="row">{jornada.id}</th>
                                <td>{jornada.timeToDone}</td>
                                <td>
                                {jornada.taskList.map(task =>
                                    <span>{task} <br /></span> 
                                )} 
                                </td>
                            </tr>
                        )}
                    </tbody>
                </table>
                <div align="right">
                    <button type="button" class="btn btn-primary" onClick={this.getData.bind(this)}>Refrescar</button>
                </div>
            </div>
        )
    }

}

export default Body;