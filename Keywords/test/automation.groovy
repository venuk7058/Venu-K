package test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class automation {


	@Keyword
	def printMessage(){

		println("\n Hello world!!! \n")
		println("\n Hello world!!! \n")
		println("\n Hello world!!! \n")
	}

	@Keyword
	def printName(String name, int abc) {
		println("\n")
		println(" Hello "+name+"!!! \n")
		println(" Hello "+abc+"!!! \n")
	}

	@Keyword
	def calcSum() {
		def a=10;
		def b=8;
		def c=a+b;

		println("\n Sum is "+c+"")
	}

	//This is a function to print sum
	@Keyword
	def calcSum1(int a,int b) {
		def c=a+b;

		println("\n Sum is "+c+"")
	}

	//This is a function to print sum


	@Keyword
	def calcSumfloat(float a,float b) {
		float c=a+b;

		println("\n Sum is "+c+"")
	}

	@Keyword
	def calcfloat1(def a,def b) {
		def c=a+b;

		println("\n Sum is "+c+"")
	}

	@Keyword
	def calcfloat2(long a,long b) {
		long c=a+b;

		println("\n Sum is "+c+"")
	}


}



