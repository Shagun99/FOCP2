package com.ncu.assignment.validation;

import assignment.exception.MandatoryMissingException;
import assignment.exception.DateFormatException;
import assignment.validation.StudentValidationMessage.*;

public class StudentValidation
{
	public boolean nameValidator(int skills, Date d, String firstName, String lastName, String eMail, String contactNo, String line1, String line2, String city, String state, int qual)
	{
		try
		{
			validateSkills(skills);
			validateDate(d);
			validateQualifications(qual);
			validateStudent(firstName, lastName, eMail, contactNo, line1, line2, city, state);
		}
		catch(EmptyFileNameException e)
		{
			System.out.println(e);
			return false;
		}
		catch(MandatoryMissingException e)
		{
			System.out.println(e);
			return false;	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void validateDate(Date d) throws DateFomatException
	{
		if((d.day<0 && d.day>31) && (d.month > 0 && d.month <= 12) && d.year>0)
		{
			throw new DateFomatException(date);
		}
	}

	public static void validateSkills(int skill) throws MandatoryMissingException
	{
		if(skill < 1)
		{
			throw new MandatoryMissingException(mandatory);
		}
	}

	public static void validateQualifications(int qual)
	{
		if(qual < 1)
		{
			throw new MandatoryMissingException(mandatory);
		}
	}

	public static void validateStudent(String firstName, String lastName, String eMail, String contactNo, String line1, String line2, String city, String state)
	{
		if(firstName.isEmpty() == true && eMail.isEmpty() == true && contactNo.isEmpty() == true && line1.isEmpty() == true && line2.isEmpty() == true && city.isEmpty() == true && state.isEmpty() == true)
		{
			throw new MandatoryMissingException(mandatory);
		}
	}
}