<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<mvc:resources location="img" mapping="/files/**"></mvc:resources>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
</head>
<body>
</br></br>
<div class="w3-container w3-grey w3-center">
    <h1><b>PABLITO</b></h1>
    <h1>Witaj na naszej stronie.</h1>
</div>
</br></br></br></br>
    <div align="center">
        <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="center-pill">
                <h1 class="w3-center w3-grey">Logowanie</h1>
            </div>
            <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
                <div class="w3-row w3-section w3-center">
                    <div class="w3-col"><i class="w3-xxlarge"></i></div>
                    <div class="w3-rest">
                        <tr>
                            <td>Zaloguj się, aby w pełnym zakresie przeglądać stronę.</td>
                        </tr>
                    </div>
                </div>
            </div>
            <div class="w3-row w3-section w3-center">
                <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
                <div class="w3-rest">
                    <a href="/login" class="w3-button w3-grey w3-ripple w3-center">Zaloguj</a>
                </div>
            </div>
        </form>
    </div> </br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Rejestracja</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>Nie masz konta? To nie problem, kliknij poniższy przycisk.</td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/register" class="w3-button w3-grey w3-ripple w3-center">Rejestracja</a>
            </div>
        </div>
    </form>
</div></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Sklep</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>Chciałbyś kupić elementy elektrotechniczne, zapraszamy!</td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/store" class="w3-button w3-grey w3-ripple w3-center">Sklep</a>
            </div>
        </div>
    </form>
</div></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Koszyk</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>Chciałbyś sprawdzić co znajdowało się w koszyku podczas poprzedniej sesji, kliknij.</td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/cart" class="w3-button w3-grey w3-ripple w3-center">Koszyk</a>
            </div>
        </div>
    </form>
</div></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Dobór zabezpieczenia</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>Chciałbyś dobrać zabezpieczenie, ale nie wiesz jakie,
                            wystarczy że podasz moc urządzenia bądź urządzeń podłączonych do danego obwodu,
                            a system obliczy wielkośc zabezpieczenia </td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/braker" class="w3-button w3-grey w3-ripple w3-center">Dobór zabezpieczenia</a>
            </div>
        </div>
    </form>
</div></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Obliczenie spadku napięcia</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>chciałbyś dowiedzieć sią jaki będzie spadek napięcia w kablu, podając niezbędne dane system wyliczy tą informację w dośc precyzyjny sposób.</td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/lowVoltage" class="w3-button w3-grey w3-ripple w3-center">Spadek napięcia</a>
            </div>
        </div>
    </form>
</div></br></br>
<div align="center">
    <form align="center" style="width: 800px" action="/" method="get" class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
        <div class="center-pill">
            <h1 class="w3-center w3-grey">Kontakt</h1>
        </div>
        <div  class="w3-container w3-card-4 w3-light-grey w3-text-grey w3-margin">
            <div class="w3-row w3-section w3-center">
                <div class="w3-col"><i class="w3-xxlarge"></i></div>
                <div class="w3-rest">
                    <tr>
                        <td>Jeśli masz pyatnia wszystkie dane znajdziessz tutaj</td>
                    </tr>
                </div>
            </div>
        </div>
        <div class="w3-row w3-section w3-center">
            <div class="w3-col" style="width:100px"><i class="w3-xxlarge "></i></div>
            <div class="w3-rest">
                <a href="/contact" class="w3-button w3-grey w3-ripple w3-center">Kontakt</a>
            </div>
        </div>
    </form>
</div></br></br>

</body>
</html>