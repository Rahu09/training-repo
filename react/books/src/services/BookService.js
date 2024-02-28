import axios from "axios";

const BASE_REST_API_URL = "http://localhost:8080/api/v1/book";
const config = {
  headers: {
    Authorization: `Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0aXdhcmlyYWh1bDA4MDlAZ21haWwuY29tIiwiaWF0IjoxNzA5MTE4NTc5LCJleHAiOjE3MDkyMDQ5Nzl9.egcs5UPpiu2DdNC8H0iF8AU8ssXsJosXqMf38DEmKbI`,
  },
};

class BookServices {
  async getAllBooks() {
    try {
      const response = await axios.get(
        "http://localhost:8080/api/v1/book/books",
        config
      );
      return response.data;
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }
  async deleteBook(id) {
    try {
      const response = await axios.delete(
        `${BASE_REST_API_URL}/deletebook/${id}`,
        config
      );
      return response.data;
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }

  async addBook(requestData) {
    try {
      const response = await axios.post(
        `${BASE_REST_API_URL}/addbook`,
        requestData,
        config
      );
      return response.data;
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }

  async updateBook(id, requestData) {
    try {
      const response = await axios.put(
        `${BASE_REST_API_URL}/books/${id}`,
        requestData,
        config
      );
      return response.data;
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }

  async getBookById(id) {
    try {
      const response = await axios.get(
        `${BASE_REST_API_URL}/books/${id}`,
        config
      );
      return response.data;
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }
}

export default new BookServices();
