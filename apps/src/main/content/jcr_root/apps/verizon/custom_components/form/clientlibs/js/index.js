function validate() { 
    const nif = document.querySelector('#nif').value

    const error = document.querySelector('.error-none');

    const errorDone = document.querySelector('.error')

    if (nif.length !== 9) {

        error.classList.remove('error-none')
        error.classList.add('error')
    } else { 
        errorDone.classList.remove('error')
       errorDone.classList.add('error-none');
        }
        
    } 
