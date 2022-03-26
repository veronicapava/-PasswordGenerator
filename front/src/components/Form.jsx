import { useState} from 'react'
import {fetchBack} from '../actions/fetchBack'
import {connect} from 'react-redux'

const Form = (props)=>  {
    const [valor, setValor] = useState("")
    const onSubmit = (e) => {
        e.preventDefault()
       props.dispatch(fetchBack(valor))
    }
    
  return (
    <>
     <form onSubmit={onSubmit}>
        <input type="number" onChange={(e) => setValor(e.target.value)}/>
        <br/>
        <button type="submit">Generar contraseña</button>
     </form>
    </>
  )
}

const stateMapToProps = (state) => {
    return {
        loading: state.view.loading
    }
}

export default connect(stateMapToProps) (Form)
