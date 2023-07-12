import "./App.css";
import axios from "axios";
import { useState, useEffect } from "react";
import Layout from "./components/Layout";
import { Routes, Route } from "react-router-dom";
import Header from "./components/header/Header";
import MovieHero from "./components/hero/MovieHero";
import AnimeHero from "./components/hero/AnimeHero";
// import Trailer from "./components/trailer/Trailer";
// import Reviews from "./components/reviews/Reviews";
// import NotFound from "./components/notFound/NotFound";

function App() {
  const springRoute = "http://localhost:8080";

  const [movies, setMovies] = useState();
  const [animes, setAnimes] = useState();

  const getCollectionData = async () => {
    try {
      const movieResponse = await axios.get(`${springRoute}/api/v1/movies`);
      const animeResponse = await axios.get(`${springRoute}/api/v1/anime`);
      console.log(movieResponse.data);
      console.log(animeResponse.data);
      setMovies(movieResponse.data);
      setAnimes(animeResponse.data);
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    getCollectionData();
  }, []);

  return (
    <div className="App">
      <Header />
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="/movies" element={<MovieHero movies={movies} />}></Route>
          <Route path="/anime" element={<AnimeHero animes={animes} />}></Route>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
