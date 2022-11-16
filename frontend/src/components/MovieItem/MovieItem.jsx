import React from "react";
import Card from "@mui/material/Card";
import CardContent from "@mui/material/CardContent";
import Typography from "@mui/material/Typography";
import Chip from "@mui/material/Chip";

const MovieItem = ({ name, genre, director }) => {
	return (
		<Card sx={{ maxWidth: 345 }}>
			<CardContent>
				<Typography gutterBottom variant="h5" component="div">
					{name}
				</Typography>
				<Typography variant="body2" color="text.secondary">
					Directed by: {director}
				</Typography>
				<Chip
					label={genre}
					color="primary"
					variant="outlined"
					size="small"
					sx={{ mt: 2 }}
				/>
			</CardContent>
		</Card>
	);
};

export default MovieItem;
