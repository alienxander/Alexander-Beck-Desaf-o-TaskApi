import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import Body from './components/Body';

function App() {
  return (
    <div className="App">
      <header>
        <Header />
      </header>
      <body>
        <Body />
      </body>
    </div>
  );
}

export default App;
