package padcms.dao.application.bean;

import java.util.ArrayList;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Application {

	private Long id;
	private String title;
	private String version;
	private String description;
	private String nm_twitter;
	private String nm_fbook;
	private String nm_email;
	private String nt_email;

	private ArrayList<Issue> issueList;

	public Application() {
	}

	public Application(Long id) {
		this.id = id;
	}

	public Application(Long id, String title, String version,
			String description, String nm_twitter, String nm_fbook,
			String nm_email, String nt_email) {

		this.id = id;
		this.title = title;
		this.version = version;
		this.description = description;
		this.nm_twitter = nm_twitter;
		this.nm_fbook = nm_fbook;
		this.nm_email = nm_email;
		this.nt_email = nt_email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNm_twitter() {
		return nm_twitter;
	}

	public void setNm_twitter(String nm_twitter) {
		this.nm_twitter = nm_twitter;
	}

	public String getNm_fbook() {
		return nm_fbook;
	}

	public void setNm_fbook(String nm_fbook) {
		this.nm_fbook = nm_fbook;
	}

	public String getNm_email() {
		return nm_email;
	}

	public void setNm_email(String nm_email) {
		this.nm_email = nm_email;
	}

	public String getNt_email() {
		return nt_email;
	}

	public void setNt_email(String nt_email) {
		this.nt_email = nt_email;
	}

	public ArrayList<Issue> getIssueList() {
		return issueList;
	}

	public ArrayList<Revision> getPublicshedRevisionsList() {
		ArrayList<Revision> listRevision = new ArrayList<Revision>();
		if (issueList != null) {
			for (Issue issue : issueList) {
				Revision publishedRevision = issue.getPublishedRevision();
				if (publishedRevision != null) {
					listRevision.add(publishedRevision);
				}
			}
		}
		return listRevision;
	}

	public void setIssueList(ArrayList<Issue> issueList) {
		this.issueList = issueList;
	}

	public Issue getIssue(Long id) {
		for (Issue issue : getIssueList()) {
			if (issue.getId().equals(id)) {
				return issue;
			}
		}
		return null;
	}

}
