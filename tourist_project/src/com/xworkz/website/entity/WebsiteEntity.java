package com.xworkz.website.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="web_table")
@NamedQueries({
	@NamedQuery(name="getByNameXworkz",
	query="select web from WebsiteEntity web where web.name='Xworkz'"),
	@NamedQuery(name="getByLikeUrlX",
	query="select web from WebsiteEntity web where web.url like='www.x%'"),
	@NamedQuery(name="getByMinSince",
	query="select MIN(since) as since from WebsiteEntity group by since"),
	@NamedQuery(name="getByMaxSince",
	query="select MAX(since) as since from WebsiteEntity group by since"),
	@NamedQuery(name="getBySecondMinSince",
	query="select secondMIN(since) as since from WebsiteEntity group by since"),
	@NamedQuery(name="getBySecondMaxSince",
	query="select secondMAX(since) as since from WebsiteEntity group by since ")
	
})
public class WebsiteEntity implements Serializable
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
	@Column(name="name")
 private String name;
	@Column(name="url")
 private String url;
	@Column(name="since")
 private String since;
	@Column(name="owner")
 private String owner;
	@Column(name="domain")
 private String domain;
 
 public WebsiteEntity() {
	System.out.println("invoked default no-arg const");
}

public WebsiteEntity(String name, String url, String since, String owner, String domain) {
	super();
	
	this.name = name;
	this.url = url;
	this.since = since;
	this.owner = owner;
	this.domain = domain;
}

@Override
public String toString() {
	return "WebsiteEntity [name=" + name + ", url=" + url + ", since=" + since + ", owner=" + owner
			+ ", domain=" + domain + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getSince() {
	return since;
}

public void setSince(String since) {
	this.since = since;
}

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public String getDomain() {
	return domain;
}

public void setDomain(String domain) {
	this.domain = domain;
}
 
}
