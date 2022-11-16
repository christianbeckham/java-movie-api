import Grid from "@mui/material/Grid";
import MovieItem from "../MovieItem/MovieItem";

const MovieList = ({ movies }) => {
	return (
		<Grid
			container
			rowSpacing={2}
			columnSpacing={2}
			maxWidth="md"
			sx={{ margin: "auto", my: 2 }}
		>
			{movies.map((movie) => (
				<Grid key={movie.id} item xs={4}>
					<MovieItem {...movie} />
				</Grid>
			))}
		</Grid>
	);
};

export default MovieList;
