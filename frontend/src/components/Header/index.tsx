import { Link } from 'react-router-dom';
import logo from '../../assets/logo.svg';

import "./styles.css"

const Header = () => {
  return (
    <header className="main-header">

        <img className='logo' src={logo}/>
       <Link to="/">
          <div className='logo-text'>
            <div className='logo-text-1'>Big Game</div>
            <div className='logo-text-2'> Survey</div>
          </div>
       </Link>
          
       
    </header>
  )
}

export default Header