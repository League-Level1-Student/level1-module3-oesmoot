package _04_netflix;

public class Netfilx {
public static void main(String[] args) {
	Movie starWars = new Movie("star wars original trilogy", 5);
	Movie warStars = new Movie("star wars sequel trilogy", 1);
	Movie dune = new Movie("Dune", 4);
	Movie readyPlayerOne = new Movie("ready player one", 3);
	Movie starsOfWar = new Movie("star wars prequel trilogy",3);
	NetflixQueue nfx = new NetflixQueue();
	nfx.addMovie(starWars);
	nfx.addMovie(warStars);
	nfx.addMovie(dune);
	nfx.addMovie(readyPlayerOne);
	nfx.addMovie(starsOfWar);
	nfx.printMovies();
	nfx.sortMoviesByRating();
	System.out.println("the best movie is " + nfx.getBestMovie());
	System.out.println("the second best movie is " + nfx.getMovie(1));
	
}
}
