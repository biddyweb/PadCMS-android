package padcms.dao.issue.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class PageImposition {

	private Long id;
	private Long page_id;
	private Long is_linked_to;
	private String position_type;
	

	public PageImposition() {
	}

	public PageImposition(Long id) {
		this.id = id;
	}

	public PageImposition(Long id, Long page_id, Long is_linked_to,
			String position_type) {
		super();
		this.id = id;
		this.page_id = page_id;
		this.is_linked_to = is_linked_to;
		this.position_type = position_type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPage_id() {
		return page_id;
	}

	public void setPage_id(Long page_id) {
		this.page_id = page_id;
	}

	public Long getIs_linked_to() {
		return is_linked_to;
	}

	public void setIs_linked_to(Long is_linked_to) {
		this.is_linked_to = is_linked_to;
	}

	public String getPosition_type() {
		return position_type;
	}

	public void setPosition_type(String position_type) {
		this.position_type = position_type;
	}


}