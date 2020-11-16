//import React from 'react';
//import ReactDOM from 'react-dom';
// import App from './App';

// ReactDOM.render(<App />,document.getElementById('root')
// );

import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { ThemeProvider } from '@material-ui/core/styles';
import theme from './theme';

ReactDOM.render(
  <React.StrictMode>
    <ThemeProvider theme={theme}>
    <App />
    </ThemeProvider>
  </React.StrictMode>,
  document.getElementById('root')
);


