import { useState} from 'react'
import {fetchBack} from '../actions/fetchBack'
import {connect} from 'react-redux'
import Banner from '../components/Banner'

const Form = (props)=>  {
    const [valor, setValor] = useState("")
    const onSubmit = (e) => {
        e.preventDefault()
       props.dispatch(fetchBack(valor))
    }
    
  return (
    <>
     <form onSubmit={onSubmit} className="card card-body">
        <Banner/>
        <input className="col-md-4 mx-auto" type="number" onChange={(e) => setValor(e.target.value)}/>
        <br/>
        <button className="col-md-4 mx-auto btn btn-lg btn-primary" type="submit">Generar contraseña</button>
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
