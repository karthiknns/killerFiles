package com.xworkz.exception.things;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class EventProvider {

	public void runtimeException()
	{
		System.out.println("runtimeexception  1");
		throw new RuntimeException();  // delaration of exception
	}
	
	public void annotationTypeMismatchException() {
		System.out.println("annotationTypeMismatchException  2");
		throw new AnnotationTypeMismatchException(null, null);
		
	}
	
	public void arithmeticException() {
		System.out.println("ArithmeticException  3");
		throw new ArithmeticException();
		
	}
	public void arrayStoreException() {
		System.out.println("ArrayStoreException  4");
		throw new ArrayStoreException();
		
	}
	public void  bufferOverflowException() {
		System.out.println(" BufferOverflowException  5");
		throw new  BufferOverflowException();
		
	}
	public void  cufferUnderflowException() {
		System.out.println(" BufferUnderflowException  6");
		throw new  BufferUnderflowException();
		
	}
	public void cannotRedoException() {
		System.out.println("CannotRedoException  7");
		throw new CannotRedoException();
		
	}
	
	public void   classCastException()
	{
		System.out.println("  ClassCastException 9");
		throw new   ClassCastException();
	}
	
	public void  concurrentModificationException()
	{
		System.out.println(" ConcurrentModificationException 10");
		throw new  ConcurrentModificationException();
	}
	public void  emptyStackException()
	{
		System.out.println(" EmptyStackException 11");
		throw new  EmptyStackException();
	}
	public void   enumConstantNotPresentException()
	{
		System.out.println("  EnumConstantNotPresentException 12");
		throw new   EnumConstantNotPresentException(null, null);
	}
	public void  EventException()
	{
		System.out.println(" EventException 13");
		throw new  EventException((short) 0, null);
	}
	public void   fileSystemAlreadyExistsException()
	{
		System.out.println("  FileSystemAlreadyExistsException, 14");
		throw new   FileSystemAlreadyExistsException();
	}
	public void   fileSystemNotFoundException()
	{
		System.out.println("  FileSystemNotFoundException 15");
		throw new   FileSystemNotFoundException();
	}
	public void  illegalMonitorStateException()
	{
		System.out.println(" IllegalMonitorStateException 16");
		throw new  IllegalMonitorStateException();
	}
	public void  IllegalPathStateException()
	{
		System.out.println(" IllegalPathStateException 17");
		throw new  IllegalPathStateException();
	}
	public void  illegalArgumentException()
	{
		System.out.println(" IllegalArgumentException 18");
		throw new  IllegalArgumentException();
	}
	public void  illegalStateException()
	{
		System.out.println(" IllegalStateException 19");
		throw new  IllegalStateException();
	}
	public void  imagingOpException()
	{
		System.out.println(" ImagingOpException 20");
		throw new   ImagingOpException(null);
	}
	public void  incompleteAnnotationException()
	{
		System.out.println(" IncompleteAnnotationException 21");
		throw new  IncompleteAnnotationException(null, null);
	}
	public void  indexOutOfBoundsException()
	{
		System.out.println(" IndexOutOfBoundsException 22");
		throw new  IndexOutOfBoundsException();
	}
	public void  jMRuntimeException()
	{
		System.out.println(" JMRuntimeException 23");
		throw new  JMRuntimeException();
	}
	public void  lSException()
	{
		System.out.println(" LSException 24");
		throw new  LSException((short) 0, null);
	}
	public void   malformedParameterizedTypeException()
	{
		System.out.println("  MalformedParameterizedTypeException 25");
		throw new   MalformedParameterizedTypeException();
	}
	public void  missingResourceException()
	{
		System.out.println(" MissingResourceException 26");
		throw new   MissingResourceException(null, null, null);
	}
	public void  negativeArraySizeException()
	{
		System.out.println(" NegativeArraySizeException 27");
		throw new  NegativeArraySizeException();
	}
	public void  noSuchElementException()
	{
		System.out.println(" NoSuchElementException 28");
		throw new  NoSuchElementException();
	}
	public void   noSuchMechanismException()
	{
		System.out.println("  NoSuchMechanismException 29");
		throw new   NoSuchMechanismException();
	}
	public void  NullPointerException()
	{
		System.out.println(" NullPointerException 30");
		throw new  NullPointerException();
	}
	public void  profileDataException()
	{
		System.out.println(" ProfileDataException 31");
		throw new  ProfileDataException(null);
	}
	public void  providerNotFoundException()
	{
		System.out.println(" ProviderNotFoundException 32");
		throw new  ProviderNotFoundException();
	}
	public void   rasterFormatException()
	{
		System.out.println("  RasterFormatException 33");
		throw new   RasterFormatException(null);
	}
	public void  rejectedExecutionException()
	{
		System.out.println(" RejectedExecutionException 34");
		throw new  RejectedExecutionException();
	}
	public void  securityException()
	{
		System.out.println(" SecurityException 35");
		throw new  SecurityException();
	}
	
	//***********************************************************************************************************************
	
	
	public void activationException() throws ActivationException
	{
		System.out.println("ActivationException 1");
		throw new ActivationException();
	}
	public void alreadyBoundException() throws AlreadyBoundException  // deligate // compiler will force us to handel the event // this checkd exception
	{
		System.out.println("AlreadyBoundException 2");
		throw new AlreadyBoundException();
	}
	public void aWTException() throws AWTException
	{
		System.out.println("AWTException 3");
		throw new AWTException(null);
	}
	public void badAttributeValueExpException() throws BadAttributeValueExpException
	{
		System.out.println("BadAttributeValueExpException 4");
		throw new BadAttributeValueExpException(null);
	}
	public void BadBinaryOpValueExpException() throws BadBinaryOpValueExpException
	{
		System.out.println("BadBinaryOpValueExpException 5");
		throw new BadBinaryOpValueExpException();
	}
	public void badLocationException() throws BadLocationException
	{
		System.out.println("BadLocationException 6");
		throw new BadLocationException(null, 0);
	}
	public void badStringOperationException() throws BadStringOperationException
	{
		System.out.println("BadStringOperationException 7");
		throw new BadStringOperationException(null);
	}
	public void brokenBarrierException() throws BrokenBarrierException 
	{
		System.out.println("BrokenBarrierException 8");
		throw new BrokenBarrierException();
	}
	public void  certificateException() throws  CertificateException
	{
		System.out.println(" CertificateException 9");
		throw new  CertificateException();
	}
	public void CloneNotSupportedException() throws CloneNotSupportedException
	{
		System.out.println("CloneNotSupportedException 10");
		throw new CloneNotSupportedException();
	}
	public void dataFormatException() throws DataFormatException
	{
		System.out.println("DataFormatException 11");
		throw new DataFormatException();
	}
	public void DatatypeConfigurationException() throws DatatypeConfigurationException
	{
		System.out.println("DatatypeConfigurationException 12");
		throw new DatatypeConfigurationException();
	}
	public void DestroyFailedException() throws DestroyFailedException
	{
		System.out.println("DestroyFailedException 13");
		throw new DestroyFailedException();
	}
	public void ExpandVetoException() throws ExpandVetoException
	{
		System.out.println("ExpandVetoException 14");
		throw new ExpandVetoException(null);
	}
	public void  FontFormatException() throws  FontFormatException
	{
		System.out.println(" FontFormatException 15");
		throw new  FontFormatException(null);
	}
	public void GeneralSecurityException() throws GeneralSecurityException
	{
		System.out.println("GeneralSecurityException 16");
		throw new GeneralSecurityException();
	}
	public void GSSException() throws GSSException
	{
		System.out.println("GSSException 17");
		throw new GSSException(0);
	}
	public void IllegalClassFormatException() throws IllegalClassFormatException
	{
		System.out.println("IllegalClassFormatException 18");
		throw new IllegalClassFormatException();
	}
	public void InterruptedException() throws InterruptedException
	{
		System.out.println("InterruptedException 19");
		throw new InterruptedException();
	}
	public void IntrospectionException() throws IntrospectionException
	{
		System.out.println("IntrospectionException 20");
		throw new IntrospectionException(null);
	}
	public void InvalidApplicationException() throws InvalidApplicationException
	{
		System.out.println("InvalidApplicationException, 21");
		throw new InvalidApplicationException(null);
	}
	public void InvalidTargetObjectTypeException() throws  InvalidTargetObjectTypeException
	{
		System.out.println("InvalidTargetObjectTypeException 22");
		throw new InvalidTargetObjectTypeException();
	}
	
	public void InvalidMidiDataException() throws InvalidMidiDataException
	{
		System.out.println("InvalidMidiDataException 23");
		throw new InvalidMidiDataException();
	}
	
	public void IOException() throws IOException
	{
		System.out.println("IOException 25");
		throw new IOException();
	}
	public void JAXBException() throws JAXBException
	{
		System.out.println("JAXBException 26");
		throw new JAXBException();
	}
	public void JMException() throws JMException
	{
		System.out.println("JMException 27");
		throw new JMException();
	}
	public void KeySelectorException() throws KeySelectorException
	{
		System.out.println("KeySelectorException 28");
		throw new KeySelectorException();
	}
	public void LastOwnerException() throws LastOwnerException
	{
		System.out.println("LastOwnerException 29");
		throw new LastOwnerException();
	}
	public void LineUnavailableException() throws LineUnavailableException
	{
		System.out.println("LineUnavailableException 30");
		throw new LineUnavailableException();
	}
	public void MarshalException() throws MarshalException
	{
		System.out.println("MarshalException 31");
		throw new MarshalException(null);
	}
	public void MidiUnavailableException() throws MidiUnavailableException
	{
		System.out.println("MidiUnavailableException 32");
		throw new MidiUnavailableException();
	}
	public void MimeTypeParseException() throws MimeTypeParseException
	{
		System.out.println("MimeTypeParseException, 33");
		throw new MimeTypeParseException();
	}public void NamingException() throws NamingException
	{
		System.out.println("NamingException 34");
		throw new NamingException();
	}public void NoninvertibleTransformException() throws NoninvertibleTransformException
	{
		System.out.println("NoninvertibleTransformException 35");
		throw new NoninvertibleTransformException(null);
	}
	
	//*********************************************************************************************************************************************
	

	public void ClassFormatError() {
		System.out.println("ClassFormatError 1");
		throw new ClassFormatError(null);
	}

	public void AssertionError() {
		System.out.println("AssertionError 2");
		throw new AssertionError();
	}

	public void AWTError() {
		System.out.println("AWTError 3");
		throw new AWTError(null);
	}

	public void CoderMalfunctionError() {
		System.out.println("CoderMalfunctionError 4");
		throw new CoderMalfunctionError(null);
	}

	public void FactoryConfigurationError() {
		System.out.println("FactoryConfigurationError 5");
		throw new FactoryConfigurationError();
	}

	public void Method6() {
		System.out.println("FactoryConfigurationError 7");
		throw new FactoryConfigurationError();
	}

	public void IOError() {
		System.out.println("IOError 8");
		throw new IOError(null);
	}

	public void LinkageError() {
		System.out.println("LinkageError 9");
		throw new LinkageError();
	}

	public void ClassCircularityError() {
		System.out.println("ClassCircularityError 10");
		throw new ClassCircularityError(null);
	}

	public void TransformerFactoryConfigurationError() {
		System.out.println("TransformerFactoryConfigurationError 11");
		throw new TransformerFactoryConfigurationError();
	}

	public void InternalError() {
		System.out.println("InternalError 12");
		throw new InternalError();
	}

	public void OutOfMemoryError() {
		System.out.println("OutOfMemoryError 13");
		throw new OutOfMemoryError();
	}

	public void StackOverflowError() {
		System.out.println("StackOverflowError 14");
		throw new StackOverflowError();
	}

	public void UnknownError() {
		System.out.println("UnknownError 15");
		throw new UnknownError();
	}

	public void BootstrapMethodError() {
		System.out.println("BootstrapMethodError 15");
		throw new BootstrapMethodError();
	}

	public void ExceptionInInitializerError() {
		System.out.println("ExceptionInInitializerError 16");
		throw new ExceptionInInitializerError();
	}

	public void Method17() {
		System.out.println("ClassCircularityError");
		throw new ClassCircularityError();
	}

	public void Method18() {
		System.out.println("ClassFormatError 18");
		throw new ClassFormatError();
	}

	public void IncompatibleClassChangeError() {
		System.out.println("IncompatibleClassChangeError 19");
		throw new IncompatibleClassChangeError();
	}

	public void NoClassDefFoundError() {
		System.out.println("NoClassDefFoundError 20");
		throw new NoClassDefFoundError();
	}

	public void UnsatisfiedLinkError() {
		System.out.println("UnsatisfiedLinkError 21");
		throw new UnsatisfiedLinkError();
	}

	public void VerifyError() {
		System.out.println("VerifyError 22");
		throw new VerifyError();
	}

	public void GenericSignatureFormatError() {
		System.out.println("GenericSignatureFormatError 23");
		throw new GenericSignatureFormatError();
	}

	public void UnsupportedClassVersionError() {
		System.out.println("UnsupportedClassVersionError 24");
		throw new UnsupportedClassVersionError();
	}

	public void AbstractMethodError() {
		System.out.println("AbstractMethodError 26");
		throw new AbstractMethodError();
	}

	public void IllegalAccessError() {
		System.out.println("IllegalAccessError 27");
		throw new IllegalAccessError();
	}

	public void InstantiationError() {
			System.out.println("InstantiationError");
			throw new InstantiationError();
		}

	public void NoSuchFieldError() {
			System.out.println("NoSuchFieldError 28");
			throw new NoSuchFieldError();
		}

	public void NoSuchMethodError() {
			System.out.println("NoSuchMethodError 29");
			throw new NoSuchMethodError();
		}

	public void Method30() {
			System.out.println("BootstrapMethodError 30");
			throw new BootstrapMethodError();
		}
	
	
	
}
