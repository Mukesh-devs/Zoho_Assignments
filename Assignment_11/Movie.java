abstract class Movie {
    abstract  String getMovieName() ;
    abstract void setMovieName(String movieName);
    abstract String getDirector() ;
    abstract void setDirector(String director) ;
    abstract String getActor();
    abstract void setActor(String actor);
    abstract String getActress() ;
    abstract void setActress(String actress) ;
    abstract String getMusicDirector();
    abstract void setMusicDirector(String musicDirector) ;
    abstract String getNumberOfArtists() ;
    abstract void setNumberOfArtists(int numberOfArtists);
    abstract String getReleaseYear() ;
    abstract void setReleaseYear(int releaseYear) ;
    abstract String getProducer() ;
    abstract void setProducer(String producer) ;
    abstract String isBlockBuster() ;
    abstract void setBlockBuster(boolean isBlockBuster) ;
}

class ThrillerMovie extends Movie{
    int suspenseLevel;
    String movieName;
    String director;
    String actor;
    String actress;
    String musicDirector;
    int numberOfArtists;
    int releaseYear;
    String producer;
    boolean isBlockBuster;

    public ThrillerMovie(String movieName, String director, String actor, String actress, String musicDirector,
            int numberOfArtists, int releaseYear, String producer, boolean isBlockBuster, int suspenseLevel) {
                this.movieName = movieName;
                this.director = director;
                this.actor = actor;
                this.actress = actress;
                this.musicDirector = musicDirector;
                this.numberOfArtists = numberOfArtists;
                this.releaseYear = releaseYear;
                this.producer = producer;
                this.isBlockBuster = isBlockBuster;
                this.suspenseLevel = suspenseLevel;
    }

    public String getMovieName() {
        return "The movie name is: " + movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getDirector() {
        return "The director name is: " +  director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor() {
        return "The actor name is: " +actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActress() {
        return "The actress name is: " + actress;
    }
    public void setActress(String actress) {
        this.actress = actress;
    }
    public String getMusicDirector() {
        return "The musicDirector name is: " + musicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    public String getNumberOfArtists() {
        return  "The numberOfArtists is: " + numberOfArtists;
    }
    public void setNumberOfArtists(int numberOfArtists) {
        this.numberOfArtists = numberOfArtists;
    }
    public String getReleaseYear() {
        return  "The movie got released on: " +releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getProducer() {
        return "The Producer name is: " + producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String isBlockBuster() {
        return isBlockBuster? "The movie is  a block Buster": "The movie is a flopp!!";
    }
    public void setBlockBuster(boolean isBlockBuster) {
        this.isBlockBuster = isBlockBuster;
    }

    

    public String getInfo(){
        String result = "MovieName: "+ this.movieName+ "\nActor: "+this.actor + "\nActress: "+this.actress+ "\nMusicDirector: "+this.musicDirector+"\nnumberOfArtists: "+this.numberOfArtists+" ReleasedYear: "+this.releaseYear+ "\nProducer: "+this.producer+ "\nIs This Movie a Blockbuster? : "+(this.isBlockBuster())+ "\nThe Suspense level is: "+ this.suspenseLevel;
        return result;
    }

}

class LoveMovie extends Movie{
    String memorableDialogue;
    String movieName;
    String director;
    String actor;
    String actress;
    String musicDirector;
    int numberOfArtists;
    int releaseYear;
    String producer;
    boolean isBlockBuster;

    public LoveMovie(String movieName, String director, String actor, String actress, String musicDirector,
            int numberOfArtists, int releaseYear, String producer, boolean isBlockBuster, String memorableDialogue) {
                this.movieName = movieName;
                this.director = director;
                this.actor = actor;
                this.actress = actress;
                this.musicDirector = musicDirector;
                this.numberOfArtists = numberOfArtists;
                this.releaseYear = releaseYear;
                this.producer = producer;
                this.isBlockBuster = isBlockBuster;
                this.memorableDialogue = memorableDialogue;
    }

    public String getMovieName() {
        return "The movie name is: " + movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getDirector() {
        return "The director name is: " +  director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor() {
        return "The actor name is: " +actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActress() {
        return "The actress name is: " + actress;
    }
    public void setActress(String actress) {
        this.actress = actress;
    }
    public String getMusicDirector() {
        return "The musicDirector name is: " + musicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    public String getNumberOfArtists() {
        return  "The numberOfArtists is: " + numberOfArtists;
    }
    public void setNumberOfArtists(int numberOfArtists) {
        this.numberOfArtists = numberOfArtists;
    }
    public String getReleaseYear() {
        return  "The movie got released on: " +releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getProducer() {
        return "The Producer name is: " + producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String isBlockBuster() {
        return isBlockBuster? "The movie is  a block Buster": "The movie is a flopp!!";
    }
    public void setBlockBuster(boolean isBlockBuster) {
        this.isBlockBuster = isBlockBuster;
    }

    public String getInfo(){
        String result = "MovieName: "+ this.movieName+ "\nActor: "+this.actor + "\nActress: "+this.actress+ "\nMusicDirector: "+this.musicDirector+"\nnumberOfArtists: "+this.numberOfArtists+" ReleasedYear: "+this.releaseYear+ "\nProducer: "+this.producer+ "\nIs This Movie a Blockbuster? : "+(this.isBlockBuster())+ "\nMemorable Dialogue: "+this.memorableDialogue;
        return result;
    }

}


class Q3{
    public static void main(String[] args) {
        LoveMovie movie1 = new LoveMovie("96", "Prem Kumar", "VJS", "Trisha", "Govind Vasantha", 300, 2018, "Nandha Gopal", true,"Enna Marandhuradha ena? :)");
        System.out.println(movie1.getInfo());
        System.out.println("--------------------------------------------------------------");
        ThrillerMovie movie2 = new ThrillerMovie("Leo", "Lokesh Kanagaraj", "Vj", "Trisha", "Anirudh", 300, 2023, "Lalit", true, 10);
        System.out.println(movie2.getInfo());
    }
}