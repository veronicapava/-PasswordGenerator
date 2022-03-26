import React from 'react';
import { createStore, applyMiddleware } from 'redux'
import { Provider } from 'react-redux'
import thunk from 'redux-thunk'
import { createLogger } from 'redux-logger'
import ReactDOM from 'react-dom';
import App from './containers/App';
import reducer from './reducers/reducer'
import { composeWithDevTools } from 'redux-devtools-extension'

const middleware = [thunk]
if (process.env.NODE_ENV !== 'production') {
  middleware.push(createLogger())
}

const store = createStore(
  reducer,
  composeWithDevTools(applyMiddleware(...middleware))
)


ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);
