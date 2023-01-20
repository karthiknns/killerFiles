package com.xworkz.soldires.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SoldiersDto extends AbstractAuditDto {

	@NotBlank
	@Size(min = 3, max = 20, message = "Name should be > 3")
	private String name;
	@Min(value = 0,message = "Should be > 0")
	@Max(value = 100,message = "Should be < 100")
	private int id;
	@Min(value = 0,message = "Should be > 0")
	@Max(value = 100,message = "Should be < 100")
	private int age;
	@NotBlank
	@Size(min = 3, max = 20, message = "country should be > 3")
	private String country;
	@NotBlank
	@Size(min = 3, max = 20, message = "location should be > 3")
	private String location;
}
