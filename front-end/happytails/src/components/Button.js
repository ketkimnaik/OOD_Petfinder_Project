import React from 'react';
import './Button.css'
import { Link } from 'react-router-dom'
import SignInSide from './pages/SignInSide';

export function Button() {
    return (
        <Link to='sign-up'>
            <button className='btn' title="Login" color='#1888ff'>Login</button>
        </Link>
    );
}

