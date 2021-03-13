


async function fetchData() {
    const fetchinng = await fetch('http://localhost:8080/contacts');
    const data = await fetchinng.json();
    let ul = document.createElement("ul");
    data.forEach(contact => {
        let li = document.createElement("li");
        li.innerHTML = `${contact.name} - ${contact.email} - ${contact.telephone}`
        ul.appendChild(li);
    });
    document.querySelector("#contacts").appendChild(ul);
}

fetchData();