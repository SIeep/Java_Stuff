<template>
    <div class="sign-in">
        <h1>This is the sign-in page</h1>
        <h3>Your username is: {{ username }}</h3>
    </div>
</template>

<script>
    import axios from "axios";

    export default {
        data: function() {
            return {
                message: "Welcome to the test page!",
                myName: "",
                username: ""
            };
        },

        created: function() {
            axios.get("/brandon").then(response => {
                this.myName = response.data;
            });
        },
        methods: {
            login: function() {
                var params = {
                    email: this.email,
                    password: this.password
                };
                axios
                    .post("/api/sessions", params)
                    .then(response => {
                        axios.defaults.headers.common["Authorization"] =
                            "Bearer " + response.data.jwt;
                        localStorage.setItem("jwt", response.data.jwt);
                        this.$router.push("/index");
                    })
                    .catch(error => {
                        this.errors = ["Invalid email or password."];
                        this.email = "";
                        this.password = "";
                    });
            },
        }
    }
</script>

<style scoped>

</style>

<style scoped>

</style>