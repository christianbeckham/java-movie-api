import React from "react";
import AppBar from "@mui/material/AppBar";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Container from "@mui/material/Container";
import Theaters from "@mui/icons-material/Theaters";

const NavBar = () => {
	return (
		<header>
			<AppBar position="static">
				<Container maxWidth="xl">
					<Toolbar disableGutters>
						<Theaters sx={{ display: { xs: "none", md: "flex" }, mr: 1 }} />
						<Typography
							variant="h5"
							noWrap
							component="h1"
							sx={{
								mr: 2,
								display: { xs: "none", md: "flex" },
								fontFamily: "monospace",
								fontWeight: 700,
								letterSpacing: ".15rem",
								color: "inherit",
								textDecoration: "none",
							}}
						>
							Movie Library
						</Typography>
					</Toolbar>
				</Container>
			</AppBar>
		</header>
	);
};

export default NavBar;
