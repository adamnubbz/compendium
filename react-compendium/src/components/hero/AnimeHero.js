import React from "react";
import "./Hero.css";
import Carousel from "react-material-ui-carousel";
import { Paper } from "@mui/material";

const AnimeHero = ({ animes }) => {
  return (
    <div className="movie-carousel-container">
      <Carousel>
        {animes?.map((anime) => {
          return (
            <Paper key={anime.mal_id}>
              <div className="movie-card-container">
                <div className="movie-detail">
                  <div className="movie-title">
                    <h4>{anime.title}</h4>
                  </div>
                  <div className="movie-poster">
                    <img src="" alt="" />
                  </div>
                </div>
              </div>
            </Paper>
          );
        })}
      </Carousel>
    </div>
  );
};

export default AnimeHero;
