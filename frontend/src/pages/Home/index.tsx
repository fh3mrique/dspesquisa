import { Link } from "react-router-dom"
import arrow from "../../assets/arrow.svg"
import GamerImage from "../../assets/gamer.svg"

import "./styles.css"


const Home = () => {
  return (
    <div className="home-container">
     
        <div className="home-text">
            <h1 className ="home-text-title">
                Quais jogos a galera mais gosta?
            </h1>
            <h3 className="home-text-subtitle">
                Clique no botão abaixo e saiba quais são os jogos que os gamers estão escolhendo!
            </h3>
            
            <Link to="/records">
                <div className="home-actions">
                    <button className="home-btn">
                         QUERO SABER QUEM SÃO
                    </button>
                        <div className="home-btn-icon" >
                    <   img src={arrow} alt="" /> 
                    </div>
                </div>
            </Link>
        </div>

        <img src={GamerImage} className="home-image"/>
    </div>
  )
}

export default Home