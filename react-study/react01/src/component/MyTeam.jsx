import React, { useState, useEffect } from 'react';

const MyTeam = (props) =>{
    const[so,setSo] = useState(props.so);
    const[py,setPy] = useState(props.py);

    useEffect(()=>{
        setSo(props.so);
        setPy(props.py);
    });
    console.log(props)

    return(
        <div style={{border:"1px solid"}}>
            <p>소속 : {so}</p>
            <p>이름 : {py}</p>
        </div>
    );
    

}
MyTeam.defaultProps = {
    py:"직원 선별중"
}
export default MyTeam;