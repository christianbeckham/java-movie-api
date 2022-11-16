import React, { useState, useEffect } from "react";
import NavBar from "./components/NavBar/NavBar";
import MovieList from "./components/MovieList/MovieList";

const App = () => {
	const [movies, setMovies] = useState([]);

	useEffect(() => {
		const abortController = new AbortController();

		const fetchData = async () => {
			try {
				const response = await fetch("http://localhost:8080/movies", {
					signal: abortController.signal,
				});
				const data = await response.json();
				setMovies(data);
			} catch (e) {
				if (e.name === "AbortError") return;
				console.log({ error: e.message });
			}
		};

		fetchData();

		return () => abortController.abort();
	}, []);

	return (
		<div>
			<NavBar />
			<MovieList movies={movies} />
		</div>
	);
};

export default App;
