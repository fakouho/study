import React, { useContext, useRef,useState } from 'react';
import { AppText } from '../App';

export const SubItem03 = () => {
    const tex = useContext(AppText);
    const inputRef = useRef(null); 
    const [data,setData]=useState('');

    const ting = () => {
        // const inputValue = inputRef.current.value; 
        // tex.setApptex(inputValue); 

        tex.setApptex(data); 
       
    }

    return (
        <div>
            <input 
                type='text' 
               // ref={inputRef} 
                onChange={(e)=>setData(e.target.value)
                

                }
            />
            <button onClick={ting}>전송</button>
        </div>
    );
}

export default SubItem03;
