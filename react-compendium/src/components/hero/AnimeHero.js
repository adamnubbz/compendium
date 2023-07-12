import React from "react";
import "./Hero.css";
import Carousel from "react-material-ui-carousel";

const AnimeHero = ({ animes }) => {
  return (
    <div className="movie-carousel-container">
      <Carousel>
        {animes?.map((anime) => {
          return (
            <div className="movie-card-container">
              <div className="movie-detail">
                <div className="movie-title">
                  <h4>{anime.title}</h4>
                </div>
                <div className="movie-poster">
                  <img src={anime.images.jpg.large_image_url} alt="" />
                </div>
              </div>
            </div>
          );
        })}
      </Carousel>
    </div>
  );
};

export default AnimeHero;
