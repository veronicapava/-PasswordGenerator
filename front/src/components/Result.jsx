import React from 'react'
import { connect } from 'react-redux';

const Result = (props) => {
  return (
    <div className="col-md-4 mx-auto">
      {props.result && 'Tu nueva contraseña: ' + props.result }
    </div>
  )
}

const stateMapToProps = state => {
  return {
    result: state.random.result?.password
  }
}

export default connect(stateMapToProps)(Result)