import React, { useState } from 'react';

export const MyMap02 = () => {
    const colorArray = ['red', 'orange', 'yellow', 'green', 'blue'];
    const [viewColor, setViewColor] = useState('');

    const chColor = (color) => {
        setViewColor(color);
    };

    return (
        <div>
            <h2>색상 변경하기</h2>
            <div style={{ display: 'flex'}}>
                {colorArray.map((color, index) => (
                    <div
                        key={index}
                        onClick={() => chColor(color)}
                        style={{
                            backgroundColor: color,
                            width: '50px',
                            height: '50px',
                        }}
                    />
                ))}
            </div>
            <h3>선택한 색상</h3>
            <div
                style={{
                    backgroundColor: viewColor,
                    width: '50px',
                    height: '50px',
                }}
            />
        </div>
    );
};

export default MyMap02;
