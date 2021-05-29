import React, {Component} from 'react';
import logo from './img/logo.svg'
class Header extends Component{
    render(){
        return (
            <div>
                <img id="imgBanco" src={logo} align='left'></img> <br /><br /><br /><br /><br /><hr />               
            </div>
        )
    }
    
}

export default Header;