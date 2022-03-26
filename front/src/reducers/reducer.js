import { combineReducers } from 'redux'

const view = (state = { loading: false }, action) => {
    switch (action.type) {
        case 'view-loading':
            return {
                loading: true
            }
        case 'view-loaded':
            return {
                loading: false
            }
        default: return state
    }
}
const random = (state = { result: {} }, action) => {
    switch (action.type) {
        case 'random-result': {
            return {
                result: action.data
            }
        }
        default: return state

    }
}

const rootReducer = combineReducers({ view, random })

export default rootReducer