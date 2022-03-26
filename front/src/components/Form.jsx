import { useState} from 'react'

function Form ()  {
    const generar = (e) => {
        console.log("Entrando")
        e.preventDefault()
                const baseUrl = "http://localhost:8100/"
                const endPoint = "post"
                fetch(baseUrl + endPoint,{
                  method: "POST",
                  headers: {"Content-Type": "application/json" },
                  body: JSON.stringify({size: valor})
                }).then(response => response.json())
                .then(data => console.log(data))
                .catch(err => console.log(err))
    }
    const [valor, setValor] = useState("")
  return (
    <>
     <form onSubmit={generar}>
        <input type="number" value={valor} onChange={(e) => setValor(e.target.value)}/>
        <button type="submit">Generar contraseña</button>
        <h4>Tu nueva contraseña es:</h4>
     </form>
    </>
  )
}

export default Form
