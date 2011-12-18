package org.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

@MappedSuperclass
@RooToString
@RooEntity(mappedSuperclass = true)
public abstract class BASE_ENTITY {

	@Column(nullable = false, length = 32)
	private String avaja;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "M-")
	@Column(nullable = false)
	private Date avatud;

	@Column(nullable = false, length = 32)
	private String muutja;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "M-")
	@Column(nullable = false)
	private Date muudetud;

	@Column(length = 32)
	private String sulgeja;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "M-")
	@Column(nullable = false)
	private Date suletud;

	private String kommentaar;

	public String getAvaja() {
		return avaja;
	}

	protected void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return avatud;
	}

	protected void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getMuutja() {
		return muutja;
	}

	protected void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	protected void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	protected void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getSuletud() {
		return suletud;
	}

	protected void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}
}
