package com.mime.bbs.vo;

public class ArticleVO {
	
	private int id;
	/** 标题 */
	private String title;
	/** 内容 */
	private String context;
	/** 浏览数 */
	private Integer viewCount;
	/** 评论数 */
	private Integer comments;
	/** 喜欢数 */
	private Integer likeCount;
	/** 置顶 */
	private Integer weight;
	/** 是否收藏 */
	private Boolean collect;
	private Integer authorId;
	private String nickname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public Integer getComments() {
		return comments;
	}
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Boolean getCollect() {
		return collect;
	}
	public void setCollect(Boolean collect) {
		this.collect = collect;
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	
}
