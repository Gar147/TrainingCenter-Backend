package com.traini8.training_center1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.Instant;
import java.util.List;


@Entity
public class TrainingCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 40, nullable = false)
	@Size(max = 40, message = "CenterName must be less than 40 characters")
	@NotBlank(message = "CenterName is required")
	private String centerName;

	@Column(length = 12, unique = true, nullable = false)
	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
	@NotBlank(message = "CenterCode is required")
	private String centerCode;

	@Embedded
	private Address address;

	@Min(value = 0, message = "Student capacity must be a positive number")
	private Integer studentCapacity;

	@ElementCollection
	private List<@NotBlank(message = "Courses cannot be blank") String> coursesOffered;

	@PastOrPresent(message = "CreatedOn date must not be in the future")
	private Instant createdOn;
//getters and setters
	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	@Email(message = "Invalid email format")
	private String contactEmail;

	@Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
	private String contactPhone;

	@PrePersist
	public void prePersist() {
		this.createdOn = Instant.now();
	}


}

