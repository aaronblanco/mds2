package com.mds2.foro;

import com.vaadin.navigator.View;

public class Registrarse extends Registrarse_ventana implements View {
//	private TextField _nombreUser;
//	private TextField _contrasena;
//	private TextField _correoElectronico;
//	private TextField _nombreCompleto;
//	private TextField _descripcion;
//	private Button _adjuntarFotoPerfil;
//	private Image _foto;
//	private Button _validarDatos;
	public Correo_electrónico _unnamed_Correo_electrónico_;
	public Menu_UNR _unnamed_Menu_UNR_;

	public Registrarse() {
		
		
		
		
		
		
		
		/*/
		FormLayout layoutWithBinder = new FormLayout();
		Binder<Contact> binder = new Binder<>();

		// The object that will be edited
		Contact contactBeingEdited = new Contact();

		// Create the fields
		TextField firstName = new TextField();
		firstName.setValueChangeMode(ValueChangeMode.EAGER);
		TextField lastName = new TextField();
		lastName.setValueChangeMode(ValueChangeMode.EAGER);
		TextField phone = new TextField();
		phone.setValueChangeMode(ValueChangeMode.EAGER);
		TextField email = new TextField();
		email.setValueChangeMode(ValueChangeMode.EAGER);
		DatePicker birthDate = new DatePicker();
		Checkbox doNotCall = new Checkbox("Do not call");
		Label infoLabel = new Label();
		NativeButton save = new NativeButton("Save");
		NativeButton reset = new NativeButton("Reset");

		layoutWithBinder.addFormItem(firstName, "First name");
		layoutWithBinder.addFormItem(lastName, "Last name");
		layoutWithBinder.addFormItem(birthDate, "Birthdate");
		layoutWithBinder.addFormItem(email, "E-mail");
		FormItem phoneItem = layoutWithBinder.addFormItem(phone, "Phone");
		phoneItem.add(doNotCall);

		// Button bar
		HorizontalLayout actions = new HorizontalLayout();
		actions.add(save, reset);
		save.getStyle().set("marginRight", "10px");

		SerializablePredicate<String> phoneOrEmailPredicate = value -> !phone
		        .getValue().trim().isEmpty()
		        || !email.getValue().trim().isEmpty();

		// E-mail and phone have specific validators
		Binding<Contact, String> emailBinding = binder.forField(email)
		        .withValidator(phoneOrEmailPredicate,
		                "Both phone and email cannot be empty")
		        .withValidator(new EmailValidator("Incorrect email address"))
		        .bind(Contact::getEmail, Contact::setEmail);

		Binding<Contact, String> phoneBinding = binder.forField(phone)
		        .withValidator(phoneOrEmailPredicate,
		                "Both phone and email cannot be empty")
		        .bind(Contact::getPhone, Contact::setPhone);

		// Trigger cross-field validation when the other field is changed
		email.addValueChangeListener(event -> phoneBinding.validate());
		phone.addValueChangeListener(event -> emailBinding.validate());

		// First name and last name are required fields
		firstName.setRequiredIndicatorVisible(true);
		lastName.setRequiredIndicatorVisible(true);

		binder.forField(firstName)
		        .withValidator(new StringLengthValidator(
		                "Please add the first name", 1, null))
		        .bind(Contact::getFirstName, Contact::setFirstName);
		binder.forField(lastName)
		        .withValidator(new StringLengthValidator(
		                "Please add the last name", 1, null))
		        .bind(Contact::getLastName, Contact::setLastName);

		// Birthdate and doNotCall don't need any special validators
		binder.bind(doNotCall, Contact::isDoNotCall, Contact::setDoNotCall);
		binder.bind(birthDate, Contact::getBirthDate, Contact::setBirthDate);

		// Click listeners for the buttons
		save.addClickListener(event -> {
		    if (binder.writeBeanIfValid(contactBeingEdited)) {
		        infoLabel.setText("Saved bean values: " + contactBeingEdited);
		    } else {
		        BinderValidationStatus<Contact> validate = binder.validate();
		        String errorText = validate.getFieldValidationStatuses()
		                .stream().filter(BindingValidationStatus::isError)
		                .map(BindingValidationStatus::getMessage)
		                .map(Optional::get).distinct()
		                .collect(Collectors.joining(", "));
		        infoLabel.setText("There are errors: " + errorText);
		    }
		});
		reset.addClickListener(event -> {
		    // clear fields by setting null
		    binder.readBean(null);
		    infoLabel.setText("");
		    doNotCall.setValue(false);
		});
		
		
		
		*/
	}
	public void validarDatos() {
		throw new UnsupportedOperationException();
	}

	public void adjuntarFotoPerfil() {
		throw new UnsupportedOperationException();
	}
}