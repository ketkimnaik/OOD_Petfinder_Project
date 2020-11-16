import React from "react";
import { MDBCol, MDBIcon } from "mdbreact";
import './SearchPage.css'

const SearchPage = () => {
  return (
    <>
    <div class="s01">
      <form>
        <fieldset>
          <legend>Find your best friend right near you! </legend>
        </fieldset>
        <div class="inner-form">
          <div class="input-field first-wrap">
            <input id="search" type="text" placeholder="Enter your city or zipcode here .." />
          </div>
          <div class="input-field third-wrap">
            <button class="btn-search" type="button">Search</button>
          </div>
        </div>
      </form>
    </div>
    </>
  );
}




export default SearchPage;