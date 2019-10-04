package th.co.nuttida.tellermgmt.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import th.co.nuttida.tellermgmt.domain.InqResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryController {

    private static final String DEFAULT_CUSTOMER_ID = "0123456789";

    @ApiOperation(value = "Inquiry Customer", notes = "Inquiry Customer by ID Card or Passport Number")
    @RequestMapping(value = "/InquiryByCustomerID", method = RequestMethod.GET)
    public InqResponse inqByCustID(
            @ApiParam(value = "ID Card or Passport Number", required = true)
            @RequestParam(value = "customerID", defaultValue = DEFAULT_CUSTOMER_ID) String customerID)
    {

        InqResponse inqResponse = new InqResponse();

        if (DEFAULT_CUSTOMER_ID.equals(customerID)) {
            inqResponse.setName("No.15");
            inqResponse.setLastName("Minimal Dev");
        } else {
            inqResponse.setName(customerID);
            inqResponse.setLastName(customerID);
        }

        return inqResponse;
    }

}