import React from 'react'

const one = () => {
  const [deck, setDeck] = useState(""); 
  const [nodeck, setNodeck] = useState([]); 

  const  deckClick= () => {
    if (comment) {
        setNodeck([...nodeck, deck]); 
        setDeck(""); 
    }
  };


  return (
    <div>
        댓글 내용 : <input type="text" value={deck} onClick={(e)=>setNodeck} />
        <button>내용 등록</button>
        <hr/>
        <p>이곳에 추가되는 댓글이 누적됩니다.</p>
        <ul>
        {nodeck.map((c, index) => (
          <li key={index}>{c}</li> // 추가된 댓글 표시
        ))}
      </ul>
    </div>
  )
}

export default one