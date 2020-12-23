import React from 'react';

const MenuItem = ({title, children}) => {
    return (
        <li className="active">
            <a href="/" title={title}>{children}</a>
        </li>
    );
};

const Menu = () => {
    return (
        <nav className='navbar navbar-default' role='navigation'>
            <div className='container'>
                <div className='navbar-header'>
                    <a className='navbar-brand' href='/'><span></span></a>
                    <button type='button' className='navbar-toggle' data-toggle='collapse' data-target='#main-navbar'>
                        <span className='icon-bar'></span>
                        <span className='icon-bar'></span>
                        <span className='icon-bar'></span>
                    </button>
                </div>
                <div className='navbar-collapse collapse' id='main-navbar'>
                    <ul className='nav navbar-nav navbar-right'>
                        <MenuItem title='home page'>
                            <span className='glyphicon glyphicon-home' aria-hidden='true'></span>
                            <span>Home</span>
                        </MenuItem>
                    </ul>
                </div>
            </div>
        </nav>
    );
};

export default Menu;