package service;

//business service
public class TutorialFinderService {
	public String getBestTutorialSite(String language) {
		if (language.equals("java")) {
			return "Java Brains";
		} else {
			return "Lanaguage not support yet";
		}
	}
}
