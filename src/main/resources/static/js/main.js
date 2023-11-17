function validateForm() {
    let pass = true;
    let email_address = document.forms["userForm"]["email_address"].value;
    let title = document.forms["userForm"]["title"].value;
    let first_name = document.forms["userForm"]["first_name"].value;
    let last_name = document.forms["userForm"]["last_name"].value;
    let address_line_1 = document.forms["userForm"]["address_line_1"].value;
    let address_line_2 = document.forms["userForm"]["address_line_2"].value;
    let city = document.forms["userForm"]["city"].value;
    let postcode = document.forms["userForm"]["postcode"].value;
    let phone_number = document.forms["userForm"]["phone_number"].value;

    if (email_address.length > 255) {
        alert("email_address exceeds length limit");
        return false;
    }
    if (title.length > 5) {
            alert("title exceeds length limit");
            return false;
    }
    if (first_name.length > 50) {
            alert("first_name exceeds length limit");
                return false;
    }
    if (last_name.length > 50) {
                    alert("last_name exceeds length limit");
                    return false;
    }
    if (address_line_1.length > 255) {
                        alert("address_line_1 exceeds length limit");
                        return false;
    }
    if (address_line_2.length > 255) {
                            alert("address_line_2 exceeds length limit");
                            return false;
    }
    if (city.length > 255) {
                                alert("city exceeds length limit");
                                return false;
    }
    if (postcode.length > 10) {
                                    alert("postcode exceeds length limit");
                                    return false;
    }
    if (phone_number.length > 20) {
                                    alert("phone_number exceeds length limit");
                                    return false;
    }

    // else true
    return true;
}