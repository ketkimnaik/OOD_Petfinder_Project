import React from 'react';
import './App.css';
import Navbar from './components/Navbar'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'
import Services from './components/pages/Services'
import Home from './components/pages/Home'
import SignUp from './components/pages/SignUp'
import ContactUs from './components/pages/ContactUs';
import SignInSide from './components/pages/SignInSide';
import Nutrition from './components/pages/Nutrition';
import 'mdbreact/dist/css/mdb.css';
import SearchPage from './components/pages/SearchPage';
function App() {
  return (
    <Router>
      <Navbar/>
      <Switch>
        <Route path='/' exact component={Home} />
        <Route path='/nutrition' exact component={Nutrition} />
        
        <Route path='/sign-up' exact component={SignInSide} />
        <Route path='/signuppage' exact component={SignUp} />
        <Route path='/contactus' exact component={SignUp} />
        <Route path='/searchpage' exact component={SearchPage} />
      </Switch>
    </Router>
  );
}

export default App;
