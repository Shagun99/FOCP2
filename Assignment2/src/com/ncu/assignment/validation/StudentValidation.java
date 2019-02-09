package com.ncu.assignment.validation;

import com.ncu.assignment.exception.DateFormatException;
import com.ncu.assignment.exception.MandatoryMissingException;
//import assignment.validation.StudentValidationMessage.*;
import com.ncu.assignment.validation.StudentValidationMessage.StudentValidationMessage;
import com.ncu.assignment.date.*;

public class StudentValidation
{
	public void studentValidator(int skills, String firstName, String lastName, String eMail, String contactNo, String line1, String line2, String city, String state, int qual)
	{
		try
		{
			validateSkills(skills);
			validateQualifications(qual);
			validateStudent(firstName, lastName, eMail, contactNo, line1, line2, city, state);
		}
		catch(MandatoryMissingException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void dateValidator(int day, int month, int year)
	{
		try
		{
			validateDate(day, month, year);
		}
		catch(DateFormatException e)
		{
			System.out.println(e);
		}
	}


	public static void validateDate(int day, int month, int year) throws DateFormatException
	{
		if((day<0 && day>31) && (month > 0 && month <= 12) && year<0)
		{
			throw new DateFormatException(StudentValidationMessage.dateFormat);
		}
	}

	public static void validateSkills(int skill) throws MandatoryMissingException
	{
		if(skill < 1)
		{
			throw new MandatoryMissingException(StudentValidationMessage.mandatoryMissing);
		}
	}

	public static void validateQualifications(int qual) throws MandatoryMissingException
	{
		if(qual < 1)
		{
			throw new MandatoryMissingException(StudentValidationMessage.mandatoryMissing);
		}
	}

	public static void validateStudent(String firstName, String lastName, String eMail, String contactNo, String line1, String line2, String city, String state) throws MandatoryMissingException
	{
		if(firstName.isEmpty() == true && eMail.isEmpty() == true && contactNo.isEmpty() == true && line1.isEmpty() == true && line2.isEmpty() == true && city.isEmpty() == true && state.isEmpty() == true)
		{
			throw new MandatoryMissingException(StudentValidationMessage.mandatoryMissing);
		}
	}
}