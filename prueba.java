// Función para verificar las respuestas de la Prueba 1
function checkAnswers() {
    const correctAnswers = {
        gap1: 'semisólida',
        gap2: 'polímero',
        gap3: 'polímero',
        gap4: 'pH',
        gap5: 'conservante',
        gap6: 'vehículo',
        gap7: 'base'
    };

    let allCorrect = true;

    for (let gap in correctAnswers) {
        const userInput = document.getElementById(gap).value.toLowerCase().trim();
        const correctAnswer = correctAnswers[gap];
        if (userInput !== correctAnswer) {
            allCorrect = false;
            document.getElementById(gap).value = ''; // Reset incorrect answers
        } else {
            document.getElementById(gap).disabled = true; // Disable correct answers
        }
    }

    if (allCorrect) {
        showPopup('¡Enhorabuena!', 'Pasas a la siguiente prueba.', 'green', 'prueba2.html');
    } else {
        showPopup('¡Vuelve a intentarlo!', 'Debes acertar todas las respuestas para pasar a la siguiente prueba.', 'red');
    }
}

// Función para mostrar los pop-ups
function showPopup(message, subMessage, color, nextPage = '') {
    const popup = document.getElementById('popup');
    const popupMessage = document.getElementById('popupMessage');
    popup.style.display = 'flex';
    popupMessage.innerHTML = `<span style="color:${color};">${message}</span><br>${subMessage}`;

    if (nextPage) {
        document.getElementById('popupButton').onclick = function() {
            window.location.href = nextPage;
        };
    } else {
        document.getElementById('popupButton').onclick = function() {
            popup.style.display = 'none';
        };
    }
}

// Función para cerrar el pop-up de la prueba 1
function closePopup() {
    document.getElementById('popup').style.display = 'none';
}

// Función para verificar la respuesta de la Prueba 2
function checkAnswers2() {
    const correctAnswer = 'oleogel';
    const userInput = document.getElementById('gap2_1').value.toLowerCase().trim();

    if (userInput === correctAnswer) {
        showPopup('¡Enhorabuena!', 'Has logrado superar la actividad.', 'green');
    } else {
        showPopup('¡Vuelve a intentarlo!', 'Reintenta la respuesta.', 'red');
    }
}

// Función para cerrar el pop-up de la prueba 2
function closePopup2() {
    document.getElementById('popup2').style.display = 'none';
}
