import React from "react";
import "./Hero.css";
import Carousel from "react-material-ui-carousel";

const MovieHero = ({ movies }) => {
  return (
    <div className="movie-carousel-container">
      <Carousel>
        {movies?.map((movie) => {
          return (
            <div className="movie-card-container">
              <div className="movie-detail">
                <div className="movie-title">
                  <h4>{movie.title}</h4>
                </div>
                <div className="movie-poster">
                  <img src={movie.poster} alt="" />
                </div>
              </div>
            </div>
          );
        })}
      </Carousel>
    </div>
  );
};

export default MovieHero;
