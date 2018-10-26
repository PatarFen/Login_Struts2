package action;

import service.TutorialFinderService;

public class TutorialAction {

	private String bestTutorialSite="heheda";
	
	private String language;
	
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String execute() {
		/* return "failure"; */
		//TutorialFinderService tutorialFinderService = new TutorialFinderService();
		//setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
        System.out.println(getLanguage());
		return "success";
	}


}
