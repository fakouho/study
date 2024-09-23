import logo from './logo.svg';
import './App.css';
import { useEffect } from 'react';
import api from './api'; 

function App() {

  
  const getMovieData = async () => {
    try {
      const API_URL = '/movie/popular?language=ko-KR&page=1';
      const res = await api.get(API_URL); 
      console.log(res.data); 
    } catch (error) {
      console.error(error); 
    }
  }

  
  useEffect(() => {
    getMovieData(); 
  }, []);

  return (
    <div className="App">
      
    </div>
  );
}

export default App;
