package week4;

public class MediaDemo {

	public static void main(String[] args) {
		
		CD cd = new CD();
		Video video = new Video();
		
		cd.setID("1");
		cd.setName("cd name");
		cd.setGenre("genre");
		
		video.setID("2");
		video.setName("video name");
		video.setRuntime(5);
		
		System.out.println(cd.getID() + " " + cd.getName() + " " + cd.getGenre());
		System.out.println(video.getID() + " " + video.getName() + " " + video.getRuntime());
		
		CD cd2 = new CD("3", "cd2 name", "genre2");
		Video video2 = new Video("4", "video name", 4);
		
		System.out.println(cd.equals(cd));
		System.out.println(cd.equals(cd2));
		
		System.out.println(video.equals(video));
		System.out.println(video.equals(video2));
		
		System.out.println(cd.toString());
		System.out.println(video.toString());
		
		cd.displayInfo();
		video.displayInfo();
	}

}
