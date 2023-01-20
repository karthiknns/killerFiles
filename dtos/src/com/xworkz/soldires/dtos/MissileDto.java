package com.xworkz.soldires.dtos;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MissileDto extends AbstractAuditDto {
	@NotNull
	@Size(min =3,max = 10 ,message = "name should be min 3 max 10")
private String name;
}
