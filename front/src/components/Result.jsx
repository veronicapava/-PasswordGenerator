import React from 'react'
import { connect } from 'react-redux';

const Result = (props) => {
  return (
    <>
      {props.result && 'Tu nueva contraseña: ' + props.result }
    </>
  )
}

const stateMapToProps = state => {
  return {
    result: state.random.result?.password
  }
}

export default connect(stateMapToProps)(Result)